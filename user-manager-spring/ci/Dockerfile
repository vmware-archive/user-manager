FROM openjdk:8

# Set Env vars
ENV POSTGRESQL_VERSION 9.4
ENV TERM xterm

# Install dependencies
RUN apt-get update && apt-get install -y \
    make \
    postgresql \
    postgresql-client \
    sudo \

    && \

    apt-get clean \

    && \

    rm -Rf /var/lib/apt/lists/*

# Override postgres connection settings to allow local TCP
COPY ./pg_hba_sample.conf /etc/postgresql/$POSTGRESQL_VERSION/main/pg_hba.conf
RUN chown postgres:postgres /etc/postgresql/$POSTGRESQL_VERSION/main/pg_hba.conf

# Prepare to run tests
WORKDIR /usr/local/user-manager-spring
