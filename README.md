### urlshortnerserverless

### Sample application to deploy Spring native image to AWS Lambda. Application does more than <i>hello world</i>.

##### Requirements:
- make sure to create native image on Amazon Linux 2 machine. You can create am instance on AWS or simply use the docker image for this.
```
docker pull chaudharydeepak08/awslinuxcloud
```
- package bootstrap and generated native image as a zip and upload to AWS Lambda.
