CREATE TABLE public.entity (
	id int4 NOT NULL,
	"name" varchar(255) NULL,
	species varchar(255) NULL,
	globe_area varchar(255) NULL,
	sqm_needed int4 NULL,
	water_quantity int4 NULL,
	water_freq int4 NULL,
	water_freq_type varchar(255) NULL,
	CONSTRAINT entity_pkey PRIMARY KEY (id)
);

CREATE TABLE public.plant (
) inherits(public.entity);

CREATE TABLE public.animal (
	gender varchar(255),
	diet varchar(255),
	feeding_freq_type varchar(255),
	feeding_freq int4,
	feeding_quantity int4
) inherits(public.entity);
