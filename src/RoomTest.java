public class RoomTest {
   public static void main(String[] args) {
      Room room1 = new Room("pokój numer 1", 10, 29, new BasicAirConditioner(25));
      Room room2 = new Room("pokój numer 2", 25, 27, new ProAirConditioner(26));

      System.out.println("room 1" + room1);
      room1.turnAc();
      System.out.println("room 1 after ac " + room1);

      System.out.println("room 2" + room1);
      room2.turnAc();
      System.out.println("room 2 after ac " + room2);

      room2.turnAc();
      System.out.println("room 2 after ac " + room2);

   }

}
