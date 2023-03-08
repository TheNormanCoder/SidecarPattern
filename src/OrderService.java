// servizio per la gestione degli ordini
public class OrderService {
    private Sidecar sidecar;

    public OrderService(Sidecar sidecar) {
        this.sidecar = sidecar;
    }

    public void createOrder(Order order) {
        // salva l'ordine nella cache
        sidecar.getCache().put(order.getId(), order);

        // stampa un messaggio di log
        System.out.println("Ordine creato: " + order);
    }
}
