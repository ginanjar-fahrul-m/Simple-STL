package stl.simple.object;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
@XmlRootElement
public class Customer {

    String name;
    int age;
    int id;

    /**
     * Customer's name.
     * 
     * @return customer's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Set customer's name.
     * 
     * @param name
     *      customer's name.
     */
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Customer's age.
     * 
     * @return customer's age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Set customer's age.
     * 
     * @param age
     *      customer's age.
     */
    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Customer's id.
     * 
     * @return customer's id.
     */
    public int getId() {
        return id;
    }

    /**
     * Set customer's id.
     * 
     * @param id
     *      customer's id.
     */
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Print object to screen.
     */
    public void print() {
        System.out.println("Customer " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }
}