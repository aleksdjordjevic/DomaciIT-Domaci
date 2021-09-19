package rs.itbootcamp.dao;

import rs.itbootcamp.database.DatabaseConnection;
import rs.itbootcamp.model.FoodModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodDaoSQL implements FoodDao {
    private static final Connection conn = DatabaseConnection.getConnection();

    @Override
    public void add(FoodModel fm) {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO food " +
                    "VALUES (?,?,?,?,?,?)");
            st.setInt(1, fm.getFoodId());
            st.setString(2, fm.getFoodName());
            st.setDouble(3, fm.getFoodKcal());
            st.setDouble(4, fm.getFoodProteins());
            st.setDouble(5, fm.getFoodCarbohydrates());
            st.setDouble(6, fm.getFoodFat());
            st.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addToMeal(int meal_id, int food_id, double mass) {
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO mealfood VALUES (?,?,?)");
            st.setInt(1, meal_id);
            st.setInt(2, food_id);
            st.setDouble(3, mass);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addToFridge(int fridge_id, int food_id, double mass) {
        // TODO
        try {
            PreparedStatement st = conn.prepareStatement("INSERT INTO fridge VALUES (? , ?, ?)");
            st.setInt(1, fridge_id);
            st.setInt(2, food_id);
            st.setDouble(3, mass);
            st.execute();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM food WHERE food_id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(FoodModel fm) {
        try {
            PreparedStatement st = conn.prepareStatement("UPDATE food " +
                    "SET food_id = ?, " +
                    "food_name = ?, " +
                    "food_kcal = ?, " +
                    "food_proteins = ?, " +
                    "food_carbs = ?, " +
                    "food_fat = ? " +
                    "WHERE food_id = ?");
            st.setInt(1, fm.getFoodId());
            st.setString(2, fm.getFoodName());
            st.setDouble(3, fm.getFoodKcal());
            st.setDouble(4, fm.getFoodProteins());
            st.setDouble(5, fm.getFoodCarbohydrates());
            st.setDouble(6, fm.getFoodFat());
            st.setInt(7, fm.getFoodId());
            st.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public FoodModel getFood(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food WHERE food_id = " + id);
            if (rs.next()) {
                return new FoodModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6)
                );
            } else {
                System.out.println("No results");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public List<FoodModel> getAllFood() {
        List<FoodModel> allFood = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6)
                );

                allFood.add(newFood);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allFood;
    }

    @Override
    public void pretraga(String s) {
        String[] parts = s.split(" ");   //razdvajanje string na podstingove
        String s1 = parts[0];
        String s2 = parts[1];
        List<FoodModel> rezultatPretrage = new ArrayList<>();
        try {
            Statement st = conn.createStatement();//pretraga food-a po s1 pa po s2
            ResultSet rs = st.executeQuery("SELECT food_name FROM food WHERE " +
                    "food_name LIKE " + " '%" + s1 + "%' ");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT food_name FROM food WHERE " +
                    "FOOD_NAME LIKE " + " '%" + s2 + "%'");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//pretraga meal_name po s1
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT meal_name FROM meal WHERE " +
                    "meal_name LIKE " + "'%" + s1 + "'%");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//pretraga meal_name po s2
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT meal_name FROM meal WHERE " +
                    "meal_name LIKE " + "'%" + s2 + "%'");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//pretraga meal_desc po s1
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT meal_desc FROM meal WHERE " +
                    "meal_desc LIKE " + "'%" + s1 + "'%");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//pretraga meal_desc po s2
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT meal_desc FROM meal WHERE " +
                    "meal_desc LIKE " + "'%" + s2 + "%'");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

//pretraga meal_difficulty po s1
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT meal_difficulty FROM meal WHERE " +
                    "meal_difficulty LIKE " + "'%" + s1 + "'%");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//pretraga meal_difficulty po s2
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT meal_desc FROM meal WHERE " +
                    "meal_difficulty LIKE " + "'%" + s2 + "%'");
            while (rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getString(2)
                );
                rezultatPretrage.add(newFood);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



        System.out.println("Rezultat pretrage" + rezultatPretrage);


    }
}
