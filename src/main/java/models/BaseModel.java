package models;

import jakarta.persistence.*;
import org.springframework.context.event.EventListener;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass // shows it is inherited by every class
@EntityListeners(AuditingEntityListener.class)// to update the class values at every instance

public class BaseModel  {

   @Id// declaring as primary key
   @GeneratedValue(strategy= GenerationType.IDENTITY) // unique value in series
    private Long id;// L can have null values(Like Integer)

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)// gives it in time format
    private Date created_Date;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_Date;
}
