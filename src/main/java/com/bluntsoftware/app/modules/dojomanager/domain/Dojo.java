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
@Table(name = "\"dojo\"")
public class Dojo implements CustomDomain<Dojo> {

    private static final Map< Serializable, Integer > SAVED_HASHES = Collections.synchronizedMap(new WeakHashMap< Serializable, Integer >());
    private volatile Integer hashCode;
    private Integer id = null;
    private String name;
    private String street;
    private String city;
    private String zipcode;
    private String phoneno;
    private String faxno;
    private String website;
    private String email;

    public Dojo() { }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dojo_id_seq")
    @SequenceGenerator(name = "dojo_id_seq", allocationSize = 1, sequenceName = "dojo_id_seq", initialValue = 1)
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

    @Column(name = "\"name\"", length = 255)
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Column(name = "\"street\"", length = 255)
    public String getStreet() {
        return street;
    }
    public void setStreet(String street){
        this.street = street;
    }

    @Column(name = "\"city\"", length = 255)
    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    @Column(name = "\"zipcode\"", length = 255)
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

    @Column(name = "\"phoneno\"", length = 255)
    public String getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(String phoneno){
        this.phoneno = phoneno;
    }

    @Column(name = "\"faxno\"", length = 255)
    public String getFaxno() {
        return faxno;
    }
    public void setFaxno(String faxno){
        this.faxno = faxno;
    }

    @Column(name = "\"website\"", length = 255)
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website){
        this.website = website;
    }

    @Column(name = "\"email\"", length = 255)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Transient
    public Class<?> getClassType() {
        return Dojo.class;
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

    public int compareTo(Dojo dojo) {
        return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Dojo entity = (Dojo)super.clone();
        entity.setId(null);
        return entity;
    }
}