# course-spring-data
A demo spring-boot project with CRUD operations on DB

# Installing RabbitMQ on MAC
    
    - #berw install rabbitmq
    
    - export PATH=$PATH:/usr/local/sbin

    		- In .zshrc

    	#HOMEBREW RABBITMQ
    		
		export HOMEBREW_RABBITMQ=/usr/local/Cellar/rabbitmq/3.11.4/sbin/
		
		export PATH=$PATH:$HOMEBREW_RABBITMQ
		
	- Start rabbitmq server
	
		- #rabbitmq-server
		
	- Access dashboard
	
		- http://localhost:15672
		- default username/password - guest/guest
