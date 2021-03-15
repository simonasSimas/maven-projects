package eu.academy.test;

import eu.academy.test.service.DnsProvider;
import eu.academy.test.service.DnsServer;
import eu.academy.test.service.Mapas;




/**
 * Hello world!
 * <<<<<<< HEAD
 */
public class App {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();
        dnsMapas.ideti(DnsProvider.GOOGLE, new DnsServer("8.8.8.8", "8.8.4.4"));
        dnsMapas.ideti(DnsProvider.CLOUDFARE, new DnsServer("1.1.1.1", "1.0.0.1"));
        DnsServer googleDns = dnsMapas.gauti(DnsProvider.GOOGLE);
        System.out.println(googleDns.toString());
        Mapas<String, String> zodynasMap = new Mapas<>();
        zodynasMap.ideti("Labas", "Hello");
        zodynasMap.ideti("Pasaulis", "World");
        String reiksme = zodynasMap.gauti("Labas");
        System.out.println(reiksme);
    }
}