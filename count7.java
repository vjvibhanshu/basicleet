public class count7 {
    
    public static void main(String[] args) {
        int number = 40;
        int count = 0;
        int diff;
        String build;
        for(int i=0; i<number; i++){
            if(String.valueOf(i).contains("7")){
                build = String.valueOf(i).replace("7", "");
                System.out.println("build is " + build);
                System.out.println("I is "+ i);
                diff = String.valueOf(i).length() - build.length();
                count = count + diff;
            }
        }
        System.out.println(count);
    }
}
