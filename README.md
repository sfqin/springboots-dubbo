# springboots-dubbo

## 实验说明
- 分为四个工程，两个service, 以及其对应的api工程，项目依赖关系为，service-one 依赖 service-one-api。service-two 依赖 service-one-api，service-two-api。
- dubbo 服务调用。 service-one-api 定义接口， service-one 负责实现。 service-two 远程调用 service-one 的rpc接口。
- 使用 jmh 在service-two 项目测试远程调用和本地内存调用的差距。

## TODO
- 本地缓存的使用 gauva loadingCache
- LUR方法实现
- 雪花算法实现