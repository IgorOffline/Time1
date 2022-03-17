CREATE TABLE public.demo1
(
    id serial NOT NULL,
    name character varying(160) NOT NULL,
    time timestamp with time zone NOT NULL,
    ctime timestamp with time zone NOT NULL DEFAULT now(),
    mtime timestamp with time zone NOT NULL DEFAULT now(),
    PRIMARY KEY (id)
);

ALTER TABLE public.demo1
    OWNER to postgres;
