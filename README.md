# mservices

these microservices apis example consists in a login by username.

as it uses AWS ElasticBeanStalk as IaaS, it shows how easy we can build microservices architectures.

###### login-service url: http://login-service.eba-4tzypver.us-east-1.elasticbeanstalk.com/login

###### admin-service url: http://admin-service.eba-mk8crv3y.us-east-1.elasticbeanstalk.com/user

##### both health checks are configured in the root url

##### both endpoints must pass a parameter named 'email' as a header. the only accepted value is 'superadmin@yavieira.com'

