public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] event1 = {"01:15","02:00"};
        String[] event2 = {"02:00","03:00"};
        //TEST CASES
        //event1 = ["01:00","02:00"] and event2 = ["01:20","03:00"]
        //event1 = ["10:00","11:00"] and event2 = ["14:00","15:00"]
        System.out.println(solution.haveConflict(event1, event2));
    }
}
class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int ev1_st = toTime(event1[0]);
        int ev1_end = toTime(event1[1]);
        int ev2_st = toTime(event2[0]);
        int ev2_end = toTime(event2[1]);
        if((ev2_st<= ev1_end && ev2_st>=ev1_st)||(ev1_st>=ev2_st && ev1_st<= ev2_end)) return true; //Here we do range check.
        return false;
    }
    public int toTime(String event){
        return (Integer.parseInt(event.substring(0,2)+ event.substring(3,5)));
    } //A method that converts the given information to an integer
}