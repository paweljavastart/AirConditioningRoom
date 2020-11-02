public class BasicAirConditioner extends AirConditioner {

   private final static double TEMPERATURE_STEP_DOWN_FOR_SQUARE_METER = 1;

   public BasicAirConditioner(int tresholdTemperature) {
      super(tresholdTemperature);
   }

   public void loweringTheTemperature(Room room) {
      if (getTresholdTemperature() < room.getTemperature()) {
         room.setTemperature(room.getTemperature() - (TEMPERATURE_STEP_DOWN_FOR_SQUARE_METER / room.getArea()));
      } else {
         System.out.println("nie mozna zejsc ponizej temperatury " + getTresholdTemperature());
      }
   }
}
