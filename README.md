## 电商秒杀系统

本项目实现了电商项目的秒杀功能，主要内容包含了用户登录、浏览商品、秒杀抢购、创建订单等功能，着重解决秒杀系统的并发问题。项目利用JMeter工具进行压力测试，着重对比采用缓存、消息队列等手段对于提高系统响应速度并发能力的效果。

本项目的重点是实现秒杀服务和数据库间的通信，通过 RocketMQ 进行异步消息的发送，通过 redis 缓存进行缓存优化并且和数据库有着最终一致性的保障，该项目的重点是秒 杀服务中的性能优化，使用了缓存、异步、锁等方式进行了优化。