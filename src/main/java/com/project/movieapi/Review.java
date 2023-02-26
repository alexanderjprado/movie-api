package com.project.movieapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @MongoId
    private ObjectId id;
    private String body;
}
