public class Room {
   private String name;
   private double area;
   private double temperature;
   private AirConditioner airConditioner;

   public Room(String name, double area, double temperature, AirConditioner airConditioner) {
      this.name = name;
      this.area = area;
      this.temperature = temperature;
      this.airConditioner = airConditioner;
   }

   public void turnAc(){
      airConditioner.loweringTheTemperature(this);
   }

   public double getArea() {
      return area;
   }

   public double getTemperature() {
      return temperature;
   }

   public void setTemperature(double temperature) {
      this.temperature = temperature;
   }

   @Override
   public String toString() {
      return "name='" + name + '\'' +
          ", area=" + area +
          ", temperature=" + temperature ;
   }
}
