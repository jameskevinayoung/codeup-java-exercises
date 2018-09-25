package movies;//part 3.a

public class Movie {
    public int length;


    //part 3.b
    //created private fields for the name and category;

    private String name;
    private String category;

    //create getters for the movie name and category
    //don't need parameters because, getMovieName(String) in Movie cannot be applied
    public String getMovieName(){return name;}
    public String getMovieCategory(){return category;}

    //create setters you need to pass a parameter
    public void setCategory(String category){this.category = category;}
    public void setName(String name){this.name = name;}


    //this is the movie constructor
    //use the movie constructor to add movie title and category
    public  Movie(String name, String category){
        this.name = name;
        this.category = category;
    }


}
