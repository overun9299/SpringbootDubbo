## dubbo的demo

### producer：服务的提供者

### consumer：服务的消费者

#### 使用方法producer提供接口，consumer使用@Reference初始化接口，然后调用


------

## Zookeeper
##### zkServer.cmd：Windows启动方式
##### zkEnv.cmd：启动环境设置

* 防止zkServer.cmd闪退 - 编辑zkServer.cmd 在endLocal上添加pause
* 修改 zoo_sample.cfg
  #example sakes.
  dataDir=D:\\zk\\apache-zookeeper-3.6.0-bin\\datas
  dataLogDir=D:\\zk\\apache-zookeeper-3.6.0-bin\\logs
  
* 编辑zkEnv.cmd : set ZOOCFG=%ZOOCFGDIR%\zoo_sample.cfg
