package ws;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.xml.ws.Endpoint;

import java.util.Date;
import java.util.List;

// POJO Plain Old Java Object
@WebService(serviceName = "BanqueWS")
public class Banqueservice {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt * 10.54;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random() * 9888, new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(
            new Compte(1, Math.random() * 9888, new Date()),
            new Compte(2, Math.random() * 9888, new Date()),
            new Compte(3, Math.random() * 9888, new Date())
        );
    }
}
