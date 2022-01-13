public class SparedSquare {
  public static String tpChecker(int people, int tp) {
    int NumOfSheets = tp * 500;
        int NeededNumOfSheets = people * 57;
        int NumOfDaysTPWillLast = NumOfSheets/(57 * people);
        String output1 = "";
        String output2 = "";
        if (NumOfDaysTPWillLast < 14){
            output1 = "Your TP will only last " + NumOfDaysTPWillLast + " days, buy more!";
            return output1;
        } else {
            output2 = "Your TP will last " + NumOfDaysTPWillLast + " days, no need to panic!";
            return output2;
        }
  }
}