package com.examplemsus.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //auto queried by mongoDB due to function name
    Optional<Movie> findMovieByImdbId(String imdbId);
}
