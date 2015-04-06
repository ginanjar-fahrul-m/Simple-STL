package stl.simple;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import stl.simple.object.Customer;

/**
 *
 * @author Ginanjar Fahrul M. <ginanjar.fahrul.m@gmail.com>
 * @version 1.0
 * @since   2013-11-20
 * 
 */
public class SimpleXmlParser {

    /**
     * Simple Unmarshal, read an xml file from "src/stl/simple/xml/customer.xml"
     * and convert to Customer object.
     * 
     * @throws JAXBException if something isn't right
     */
    public static void simpleUnmarshal() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        File file = new File("src/stl/simple/xml/customer.xml");
        Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
        customer.print();
    }

    /**
     * Simple Marshal, convert a Customer object into xml string.
     * 
     * @throws JAXBException if something isn't right
     */
    public static void simpleMarshal() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Customer customer = new Customer();
        customer.setId(100);
        customer.setName("Gin");
        customer.setAge(23);

        jaxbMarshaller.marshal(customer, System.out);
    }
}
