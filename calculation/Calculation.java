package calculation;
public class Calculation {

        double lat0, lat1, lon0, lon1;
        public double dist(double lat0, double lat1, double lon0, double lon1){
            lat0=Math.toRadians(lat0);
            lat1=Math.toRadians(lat1);
            lon0=Math.toRadians(lon0);
            lon1=Math.toRadians(lon1);
            double diff_lat=lat1-lat0;
            double diff_lon=lon1-lon0;
            double a = Math.pow(Math.sin(diff_lat / 2), 2)
                    + Math.cos(lat1) * Math.cos(lat1)
                    * Math.pow(Math.sin(diff_lon / 2),2);
            double c = 2 * Math.asin(Math.sqrt(a));
            double radius=6371*10^3;
            return radius*c;
        }


    }

