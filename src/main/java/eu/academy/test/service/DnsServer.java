package eu.academy.test.service;

public class DnsServer {
    private Object ip1;
    private Object ip2;

    public DnsServer(Object ip1, Object ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }

    @Override
    public String toString() {
        return "DnsServer{" +
                "ip1=" + ip1 +
                ", ip2=" + ip2 +
                '}';
    }
}
