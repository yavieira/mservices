# mservices

these microservices apis example consists in a login by username.

as it uses AWS ElasticBeanStalk as IaaS, it shows how easy we can build microservices architectures.

besides creating the EBS, it's only needed to add in both load balancers their own security groups then they establish communication

login-service url: http://admin-service.eba-mk8crv3y.us-east-1.elasticbeanstalk.com/user

admin-service url: http://login-service.eba-4tzypver.us-east-1.elasticbeanstalk.com/login

both health checks are configured in the root url

both endpoints must pass a parameter named 'email' as a header. the only accepted value is 'superadmin@yavieira.com'

