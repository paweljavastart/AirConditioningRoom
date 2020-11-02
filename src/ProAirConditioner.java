public class ProAirConditioner extends AirConditioner {
   private static double TEMPERATURE_STEP_DOWN = 1;

   public ProAirConditioner(int tresholdTemperature) {
      super(tresholdTemperature);
   }

   public void loweringTheTemperature(Room room) {
      if (getTresholdTemperature() < room.getTemperature()) {
         room.setTemperature(room.getTemperature() - TEMPERATURE_STEP_DOWN);
      } else {
         System.out.println("nie mozna zejsc ponizej temperatury " + getTresholdTemperature());
      }
   }
}
