package movies;

public class Movie {
    private String getName;

    private String category;

    public Movie(String getName, String category){
        this.getName = getName;
        this.category = category;
    }
    public String getGetName(){
        return getName;
    }
    public String getCategory(){
        return category;
    }
}
