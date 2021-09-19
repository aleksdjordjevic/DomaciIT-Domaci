package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;

import java.util.List;

public class FridgeModel {

private int foodId;
private int userId;

    public FridgeModel(int foodId, int userId) {
        this.foodId = foodId;
        this.userId = userId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "FridgeModel{" +
                "foodId=" + foodId +
                ", userId=" + userId +
                '}';
    }
}
