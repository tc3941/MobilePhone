public class MobilePhone {
    String brand,model,phoneNum;
    int storage;
    public MobilePhone(String brand, String model, String phoneNum, int storageCapacity){
        this.brand = brand;
        this.model = model;
        this.phoneNum = phoneNum;
        storage = storageCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void makeCall (String phoneNumber){
        System.out.println("We are calling " + phoneNumber + " from our " + getBrand() + " " + getModel() + " phone!");
    }
    public void installApp(String appName){
        System.out.println("Installing " + appName + " on our " + getBrand() + " " +  getModel() + " phone!");
    }
    public void displayInfo(){
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Phone Number: " + getPhoneNum());
        System.out.println("Storage Capacity: " + getStorage() + "GB");
    }
}
