/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.liferon.keycloakdemo;

/**
 *
 * @author olanrewaju.ebenezer
 */
public class GracefulShutdown { //implements TomcatConnectorCustomizer, ApplicationListener<ContextClosedEvent> {

//    private static final Logger log  = LoggerFactory.getLogger(GracefulShutdown.class);
//    
//    private volatile Connector connector;
//    
//    @Override
//    public void customize(Connector connector) {
//        this.connector = connector;
//    }
//
//    @Override
//    public void onApplicationEvent(ContextClosedEvent e) {
//        this.connector.pause();        
//        Executor executor = this.connector.getProtocolHandler().getExecutor();
//        
//        if (executor instanceof ThreadPoolExecutor) {
//            try {
//                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
//                threadPoolExecutor.shutdown();
//                
//                if (!threadPoolExecutor.awaitTermination(30, TimeUnit.SECONDS)) {
//                    log.warn("Tomcat thread pool did not shut down gracefully within "
//                            + "30 seconds. Proceeding with forceful shutdown");
//                }
//                
//            } catch (InterruptedException ex) {
//                //log.error("InterruptedException: "+ex.printStackTrace());
//                Thread.currentThread().interrupt();
//            }
//        }        
//    }   
}
