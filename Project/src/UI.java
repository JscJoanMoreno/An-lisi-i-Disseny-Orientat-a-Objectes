public class UI {
    private Library library;

    public UI() {
        this.library = LbSingleton.getLibrary();
    }

    public void talk(){
        library.talk();
    }


}
