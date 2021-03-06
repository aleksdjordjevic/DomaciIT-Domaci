package rs.itbootcamp.dao;

import rs.itbootcamp.database.DatabaseConnection;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MealDaoSQL implements MealDao {
    private static final Connection conn = DatabaseConnection.getConnection();
    @Override
    public void add(MealModel mm) {
        try{
            PreparedStatement st = conn.prepareStatement("INSERT INTO meal " +
                    "VALUES (?,?,?,?)");
            st.setInt(1,mm.getMealId());
            st.setString(2,mm.getMealName());
            st.setString(3,mm.getMealDesc());
            st.setString(4,mm.getMealDifficulty());
            st.executeUpdate();
            st.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM meal WHERE meal_id = ?");
            st.setInt(1,id);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(MealModel mm) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE meal " +
                    "SET meal_name = ?, meal_desc = ?, meal_difficulty = ? " +
                    "WHERE meal_id = ?");
            st.setString(1,mm.getMealName());
            st.setString(2,mm.getMealDesc());
            st.setString(3,mm.getMealDifficulty());
            st.setInt(4,mm.getMealId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MealModel getMeal(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal WHERE meal_id = " + id);
            if(rs.next()){
                return new MealModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4)
                        );
            }
            else{
                System.out.println("No results");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MealModel> getAllMeals() {
        List<MealModel> mealList = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal");
            while(rs.next()){
                mealList.add(new MealModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mealList;
    }

    @Override
    public List<String> getFoodMealNames(int meal_id) {
        List<String> mealNames = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT food_name FROM food WHERE food_id IN " +
                    "(SELECT food_id FROM mealfood WHERE meal_id = " + meal_id + ")");
            while(rs.next()){
                mealNames.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mealNames;
    }

    @Override
    public List<FoodModel> getFoodMeal(int meal_id) {
        List<FoodModel> meals = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food WHERE food_id IN " +
                    "(SELECT food_id FROM mealfood WHERE meal_id = " + meal_id + ")");
            while(rs.next()){
                meals.add(new FoodModel(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getDouble(3),
                            rs.getDouble(4),
                            rs.getDouble(5),
                            rs.getDouble(6)
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return meals;
    }
}
