package poo.greatbooktext;

public class GradeBook {
    
    private String nameCurse;
    
    public String getNameCurse(){
        return nameCurse;
    }
    
    public void setNameCurse(String nameCurse){
        this.nameCurse = nameCurse;
    }
    
    
    public void displayMessage(){
        System.out.println("Bienvenido al libro de notas" + " " + getNameCurse());
    }
}
