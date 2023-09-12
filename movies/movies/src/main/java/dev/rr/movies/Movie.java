package dev.rr.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {
    private ObjectId id;
    private String imdId;
    private String tittle;
    private String releaseDate;


}
