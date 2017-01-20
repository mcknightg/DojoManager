package com.bluntsoftware.app.modules.dojomanager.domain;


import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Date;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.sql.Time;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.proxy.HibernateProxy;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.*;
                    
@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Table(name = "\"schoolstudent\"")
public class Schoolstudent implements CustomDomain<Schoolstudent> {

    private static final Map< Serializable, Integer > SAVED_HASHES = Collections.synchronizedMap(new WeakHashMap< Serializable, Integer >());
    private volatile Integer hashCode;
    private Integer id = null;
    private Dojo dojo;
    private Student student;
    private Date signupdate;

    public Schoolstudent() { }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schoolstudent_id_seq")
    @SequenceGenerator(name = "schoolstudent_id_seq", allocationSize = 1, sequenceName = "schoolstudent_id_seq", initialValue = 1)
    @Column(name = "\"id\"")
    public Integer getId() {
        return id;
    }
    public void setId(Integer id){
            if ((this.id == null || this.id == 0) && id != null && hashCode != null) {
        SAVED_HASHES.put(id, hashCode);
        }
        this.id = id;
    }

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "\"dojo\"", nullable = true )
    public Dojo getDojo() {
        return dojo;
    }
    public void setDojo(Dojo dojo){
        this.dojo = dojo;
    }

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
    @JoinColumn(name = "\"student\"", nullable = true )
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student){
        this.student = student;
    }

    @JsonSerialize(using = com.bluntsoftware.lib.jpa.serializers.CustomTimestampSerializer.class, include=JsonSerialize.Inclusion.NON_NULL)
    @Column(name = "\"signupdate\"")
    public Date getSignupdate() {
        return signupdate;
    }
    public void setSignupdate(Date signupdate){
        this.signupdate = signupdate;
    }

    @Transient
    public Class<?> getClassType() {
        return Schoolstudent.class;
    }

    @Override
    public int hashCode() {
          if (hashCode == null) {
            synchronized (this) {
                if (hashCode == null) {
                    if (getId() != null) {
                        hashCode = SAVED_HASHES.get(getId());
                    }
                    if (hashCode == null) {
                        if ( getId() != null && getId() != 0) {
                            hashCode = new Integer(getId().hashCode());
                        } else {
                            hashCode = new Integer(super.hashCode());
                        }
                    }
                }
            }
        }
        return hashCode;
    }

    public int compareTo(Schoolstudent schoolstudent) {
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Schoolstudent entity = (Schoolstudent)super.clone();
        entity.setId(null);
        return entity;
    }
}