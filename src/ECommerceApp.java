import java.util.HashMap;
import java.util.Map;

// classe principale dell'applicazione di eCommerce
public class ECommerceApp {

    public static void main(String[] args) {
        // inizializza il cache e il sidecar
        Cache cache = new Cache();
        Sidecar sidecar = new Sidecar(cache);

        // crea i servizi per la gestione degli ordini e dei pagamenti
        OrderService orderService = new OrderService(sidecar);
        PaymentService paymentService = new PaymentService(sidecar);

        // crea un nuovo ordine
        Order order = new Order(1, "Prodotto 1", 100.0);

        // invoca il servizio per la creazione dell'ordine
        orderService.createOrder(order);

        // effettua il pagamento dell'ordine
        paymentService.payOrder(order.getId());
    }
}

