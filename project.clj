(defproject clojure-hbase "1.0.0-pre"
  :description "A convenient Clojure interface to HBase."
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [log4j/log4j "1.2.16" :exclusions [javax.mail/mail
                                                    javax.jms/jms
                                                    com.sun.jdmk/jmxtools
                                                    com.sun.jmx/jmxri]]
                 [org.clojure/tools.logging "0.2.3"]]
  :profiles {:clojure1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :cdh54
             {:dependencies
              [[org.apache.hbase/hbase-client "1.0.0-cdh5.4.2"
                :exclusions [org.jruby/jruby-complete]
                :scope "test"]
               [org.apache.hadoop/hadoop-test "2.6.0-mr1-cdh5.4.2"
                :scope "test"]
               [org.apache.hbase/hbase-testing-util "1.0.0-cdh5.4.2"]
               [org.apache.hadoop/hadoop-common "2.6.0-cdh5.4.2" :scope "test"]
               [org.apache.hadoop/hadoop-hdfs "2.6.0-cdh5.4.2" :scope "test"]]
              :exclusions [commons-el/commons-el
                           tomcat/jasper-runtime
                           tomcat/jasper-compiler
                           org.mortbay.jetty/jsp-2.1-jetty
                           com.sun.jersey.jersey-test-framework/jersey-test-framework-grizzly2]
              :repositories
              [["cloudera" "https://repository.cloudera.com/content/groups/public/"]]}})
