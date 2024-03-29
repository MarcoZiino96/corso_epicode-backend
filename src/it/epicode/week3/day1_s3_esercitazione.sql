	select * from public.fatture
	select * from public.clienti
	select * from public.fornitori
	select * from public.prodotti

	select * from public.clienti where nome = 'mario';
	select nome, cognome from public.clienti where annoDiNascita = '1982';
	select * from public.fatture where iva = 20;
	select *
    from public.prodotti where extract(year from dataattivazione) = 2017
	and (inproduzione = true or incommercio = true);
	select * from public.fatture f inner join public.clienti c on f.idcliente = c.numerocliente
	where importo>1000;

	select numerofattura,importo,iva,datafattura,denominazione
	from public.fatture fa inner join public.fornitori fo on fa.numerofornitore = fo.numerofornitore;

	select count(*), extract(year from datafattura)
	from public.fatture
	where iva = 20
	group by extract(year from datafattura);

	select count(*), sum(importo), extract(year from datafattura)anno
	from public.fatture
	group by extract anno;

	select extract (year from datafattura) anno
	from public.fatture
	where tipologia='A'
	group by anno
	having count(*)>2;

	select sum(importo),regioneresidenza
	from public.fatture inner join public.clienti
	on idcliente=numerocliente
	group by regioneresidenza;

	select count(distinct numerocliente)
    from public.fatture inner join public.clienti
    on idcliente=numerocliente
    where annodinascita=1980 and importo>50;




