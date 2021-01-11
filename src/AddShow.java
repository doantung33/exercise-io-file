import java.util.List;

public class AddShow {
    private List<Preson>presons;

    public AddShow() {
    }
    public AddShow(List<Preson> presons) {
        this.presons = presons;
    }

//    public List<Preson> getPresons() {
//        return presons;
//    }
//
//    public void setPresons(List<Preson> presons) {
//        this.presons = presons;
//    }
    public void add(Preson preson){
        presons.add(preson);
        IOFile.write(presons);
    }
    public void show(){
        for (Preson p :
                presons) {
            System.out.println(p.toString());
        }
    }
}
