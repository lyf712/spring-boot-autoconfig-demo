# 一、基本实践
1. 进行配置类的自动加载，并实现读取 propertes文件信息
2. 进行Listener事件的监听、并进行相关事件做相关动作
# 二、关键知识
1. 自动装配、@Bean，@Configuration，@Onditional，@PropteryOnCondition等注解熟悉
2. ApplicationContext的熟悉使用，用于获取 应用的基本信息及信息传递
3. Spring的Listener、事件机制
# 三、參考
1. shenyu 的自动装配设计
- 通过自动装配 ，配置Listener去监听 API、META、URI的信息注册
- 通过自动装配 ，将启动配置信息加载到 运行实例之中