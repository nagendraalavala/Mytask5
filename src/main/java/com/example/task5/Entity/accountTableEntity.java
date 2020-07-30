package com.example.task5.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class accountTableEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long account_number;
    private String account_type;

//    @CreatedBy
//    private String add_id;
//
//    private String upd_id;

    @CreationTimestamp
    private Timestamp add_timeStamp;

//    @UpdateTimestamp
//    private Timestamp update_timeStamp;

}
