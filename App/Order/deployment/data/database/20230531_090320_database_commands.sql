ALTER TABLE "ordermanage$order" ALTER COLUMN "orderno" RENAME TO "ordernumber";
ALTER SEQUENCE "ordermanage$order_orderno_mxseq" RENAME TO "ordermanage$order_ordernumber_mxseq";
UPDATE "mendixsystem$sequence"
 SET "name" = 'ordermanage$order_ordernumber_mxseq'
 WHERE "attribute_id" = '1df9d797-65cc-445b-a168-2f15904d86a1';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9', 
"attribute_name" = 'orderNumber', 
"column_name" = 'ordernumber', 
"type" = 0, 
"length" = 0, 
"default_value" = '1', 
"is_auto_number" = true
 WHERE "id" = '1df9d797-65cc-445b-a168-2f15904d86a1';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230531 09:03:20';
