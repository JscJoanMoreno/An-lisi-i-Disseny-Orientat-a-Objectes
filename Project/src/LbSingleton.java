public class LbSingleton {
    private static Library lb;

    public static Library getLibrary(){
        if (lb==null){
            lb = new Library();
        }
        return lb;
    }


}
