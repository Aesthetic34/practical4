package calcclient;

public class CalcClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int i = 50;
            int j = 40;
            int ARes = add(i,j);
            String SRes = sub(i,j);
            System.out.println("Addition : "+ARes);
            System.out.println(SRes);
            
                    
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        
    }

    private static int add(int i, int j) {
        com.kk.CalculatorWs_Service service = new com.kk.CalculatorWs_Service();
        com.kk.CalculatorWs port = service.getCalculatorWsPort();
        return port.add(i, j);
    }

    private static String sub(int a, int b) {
        com.kk.CalculatorWs_Service service = new com.kk.CalculatorWs_Service();
        com.kk.CalculatorWs port = service.getCalculatorWsPort();
        return port.sub(a, b);
    }
    
}
