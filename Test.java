public class Test
{
    public static void main(String args[])
    {
        System.out.println(getDateAndTime());
        System.out.println(toSString());
    }
        
    public static String getDateAndTime() 
    {
        //int time = elapsedSeconds();
        int time = 115200;

        int sec = 0;
        int min = 0;
        int hours = 0;
        int days = 0;

        if (time >= 60)
        {
            sec = time % 60;
            min = ((time / 60) % 60);
            hours = (((time / 60) / 60) % 24);
            days = (time / 86400);
        }
        else{
            sec = time;
        }
        String strSec = Integer.toString(sec);
        String strMin = Integer.toString(min);
        String strHours = Integer.toString(hours);
        String strDays = Integer.toString(days);
        
        if (strSec.length() == 1)
        {
            strSec =  "0" + strSec;
        }
        if (strMin.length() == 1)
        {
            strMin =  "0" + strMin;
        }
        if (strHours.length() == 1)
        {
            strHours =  "0" + strHours ;
        }
        if (strDays.length() == 2)
        {
            strDays = "0" + strDays;
        }
        if (strDays.length() == 1)
        {
            strDays = "00" + strDays;
        }
        
        String rTime = (strSec + strMin + strHours + strDays);
        rTime = (strDays + strHours + strMin + strSec);
        return rTime;

    }
//==============================================================================================================


    public static String toSString() 
    {
        String date = getDateAndTime();
        String human = "";
        String type = " Days, ";
        int position = 0;

        if (position == 0){
            if ((date.substring(0,1).equals("0")) && (date.substring(1,2).equals("0"))){
                human = human + date.substring(2,3) + type;
                position += 3;
            }
            else if((date.substring(0,1) == "0")){
                human = human + date.substring(1,3) + type;
                position += 3;
            }
            else{
                human = human + date.substring(0,3);
                position += 3;
            }
        }
        while (position < 9){

            if (position == 3){
                type = " Hours, ";
            }
            else if (position == 5){
                type = " Min, ";
            }
            else if (position == 7){
                type = " Sec";
            }
            if (date.substring(position,position +1).equals("0")){
                human = human + date.substring(position + 1,position +2) + type;
                position += 2;
            }
            else{
                human = human + date.substring(position, position +2) + type;
                position += 2;
            }
        }
        return human;
    }
    
}
    
    
