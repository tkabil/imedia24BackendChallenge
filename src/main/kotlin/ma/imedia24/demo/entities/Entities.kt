package ma.imedia24.demo.entities

import javax.persistence.*

@Entity
data class Product(
    @Id @GeneratedValue var id: Long? = null,
    var name: String,
    var description: String,
    var price : Double,
    @Lob @Column(columnDefinition = "MEDIUMBLOB") var image: String,
    @ManyToOne(fetch = FetchType.LAZY) var category: Category
)

@Entity
data class Category(
    @Id @GeneratedValue @Column(name="xid_category") var id: Long? = null,
    var name: String
)