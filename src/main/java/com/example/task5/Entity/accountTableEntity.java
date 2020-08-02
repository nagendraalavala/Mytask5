package com.example.task5.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class accountTableEntity {
    @Id
    private String id;
    private String account_number;

    private String account_type;

//    @CreatedBy
//    private String add_id;
//
//    private String upd_id;

//    @CreationTimestamp
//    private Timestamp add_timeStamp;

//    @UpdateTimestamp
//    private Timestamp update_timeStamp;

}
