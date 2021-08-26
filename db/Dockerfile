FROM mysql:8.0.24

MAINTAINER ganzhe(ganzhex2020@gmail.com)

ENV TZ=Asia/Shanghai

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

COPY dog.sql /docker-entrypoint-initdb.d

#COPY dog_codegen.sql /docker-entrypoint-initdb.d

COPY dog_config.sql /docker-entrypoint-initdb.d

#COPY dog_job.sql /docker-entrypoint-initdb.d
