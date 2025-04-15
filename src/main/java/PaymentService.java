// servizio per la gestione dei pagamenti
public class PaymentService {
    private Sidecar sidecar;

    public PaymentService(Sidecar sidecar) {
        this.sidecar = sidecar;
    }

    public void payOrder(int orderId) {
        // recupera l'ordine dalla cache
        Order order = sidecar.getCache().get(orderId);

        // effettua il pagamento
        System.out.println("Pagamento effettuato per l'ordine: " + order);
    }
}
