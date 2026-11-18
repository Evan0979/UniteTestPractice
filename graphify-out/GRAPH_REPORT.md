# Graph Report - JavaCode  (2026-11-15)

## Corpus Check
- cluster-only mode — file stats not available

## Summary
- 91 nodes · 183 edges · 10 communities (3 shown, 7 thin omitted)
- Extraction: 91% EXTRACTED · 9% INFERRED · 0% AMBIGUOUS · INFERRED: 16 edges (avg confidence: 0.85)
- Token cost: 0 input · 0 output

## Community Hubs (Navigation)
- .createOrder
- DiscountService
- CustomerType
- OrderResult
- Product
- ShoppingCart
- ProductCategory

## God Nodes (most connected - your core abstractions)
1. `CustomerType` - 18 edges
2. `Product` - 18 edges
3. `CartItem` - 15 edges
4. `ShoppingCart` - 14 edges
5. `OrderResult` - 13 edges
6. `DiscountService` - 12 edges
7. `DeliveryOption` - 8 edges
8. `DeliveryService` - 7 edges
9. `OrderService` - 7 edges
10. `Customer` - 7 edges

## Surprising Connections (you probably didn't know these)
- `OrderResult` --references--> `DeliveryOption`  [EXTRACTED]
  src/main/java/onlineshopping/OrderService.java → src/main/java/onlineshopping/DeliveryService.java
- `OrderService` --references--> `DiscountService`  [EXTRACTED]
  src/main/java/onlineshopping/OrderService.java → src/main/java/onlineshopping/DiscountService.java
- `OrderResult` --references--> `DiscountResult`  [EXTRACTED]
  src/main/java/onlineshopping/OrderService.java → src/main/java/onlineshopping/DiscountService.java
- `ShoppingCart` --references--> `CartItem`  [EXTRACTED]
  src/main/java/onlineshopping/ShoppingCart.java → src/main/java/onlineshopping/CartItem.java
- `Product` --references--> `ProductCategory`  [EXTRACTED]
  src/main/java/onlineshopping/Product.java → src/main/java/onlineshopping/ProductCategory.java

## Import Cycles
- None detected.

## Communities (10 total, 7 thin omitted)

### Community 0 - ".createOrder"
Cohesion: 0.24
Nodes (5): DeliveryOption, EXPRESS, STANDARD, DeliveryService, OrderService

### Community 3 - "CustomerType"
Cohesion: 0.21
Nodes (5): Customer, CustomerType, PREMIUM, REGULAR, VIP

### Community 8 - "ProductCategory"
Cohesion: 0.33
Nodes (4): ProductCategory, ACCESSORY, LAPTOP, OTHER

## Knowledge Gaps
- **8 isolated node(s):** `EXPRESS`, `STANDARD`, `PREMIUM`, `REGULAR`, `VIP` (+3 more)
  These have ≤1 connection - possible missing edges. (Counts symbols only; 24 node(s) total have ≤1 connection when file, concept and rationale nodes are included.)
- **7 thin communities (<3 nodes) omitted from report** — run `graphify query` to explore isolated nodes.

## Suggested Questions
_Questions this graph is uniquely positioned to answer:_

- **Why does `ShoppingCart` connect `ShoppingCart` to `.createOrder`, `objects`, `Product`, `.addProduct`?**
  _High betweenness centrality (0.257) - this node is a cross-community bridge._
- **What connects `EXPRESS`, `STANDARD`, `PREMIUM` to the rest of the system?**
  _8 weakly-connected nodes found - possible missing edges._
- **Why does `CustomerType` connect `CustomerType` to `.createOrder`, `DiscountService`?**
  _High betweenness centrality (0.245) - this node is a cross-community bridge._
- **Why does `Product` connect `Product` to `DiscountService`, `objects`, `ShoppingCart`, `.addProduct`, `ProductCategory`, `.toString`?**
  _High betweenness centrality (0.227) - this node is a cross-community bridge._