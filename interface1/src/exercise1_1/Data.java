package exercise1_1;

public class Data {

    public static double min(Measurable[] objects) {
        double minData =0;
        for(int i=1; i < objects.length ;i++){
            if(objects[i-1].getData()<objects[i].getData()){
                minData = objects[i-1].getData();
            }
            else if(objects[i-1].getData()>objects[i].getData()){
                minData = objects[i].getData();
            }
        }

        return minData;
        }



}
