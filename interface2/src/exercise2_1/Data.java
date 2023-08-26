package exercise2_1;

public class Data {
    public static double min(Object[] objects,Measurer meas){
        double minData =0;
            for(int i=1; i < objects.length ;i++){
                if(meas.measure(objects[i-1])<meas.measure(objects[i])){
                    minData = meas.measure(objects[i-1]);
                }
                if(meas.measure(objects[i-1])>meas.measure(objects[i])){
                    minData = meas.measure(objects[i]);
                }
            }

            return minData;

    }
}
